package com.schoolmanapp.shantigirischool.school.parent.Java_class;

import android.app.AlertDialog;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Handler;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.Toast;


import com.schoolmanapp.shantigirischool.school.R;
import com.schoolmanapp.shantigirischool.school.parent.API_interface.API_interface;
import com.schoolmanapp.shantigirischool.school.parent.Api_client.Api_client;
import com.schoolmanapp.shantigirischool.school.parent.model_class.model_adapter;
import com.schoolmanapp.shantigirischool.school.parent.utils.AppPreferences;
import com.schoolmanapp.shantigirischool.school.school.Model.Mod_Message;


import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import butterknife.Bind;
import dmax.dialog.SpotsDialog;
import retrofit2.Call;
import retrofit2.Response;


public class send_message extends Fragment {
    private List<model_adapter> modelhomes;
    List<Mod_Message.UserDataBean> student_details;
    private CardViewDataAdapter_message contactAdapter;
    private Random random;
    AlertDialog dialog;
    @Bind(R.id.send)
    ListView list;
    int pos = 0;
    int length = 0;

    AppPreferences appPreferences;


    RecyclerView recyclerView;

    int kidid,classid;
    int amount,position;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_send_message, container, false);
        recyclerView = (RecyclerView) view.findViewById(R.id.my_recycler_view);
         appPreferences = AppPreferences.getInstance(getContext(), getResources().getString(R.string.app_name));
        dialog = new SpotsDialog(getContext());
        connection();
        return view;
    }

    void connection(){
        ConnectivityManager connMgr = (ConnectivityManager) getActivity()
                .getSystemService(Context.CONNECTIVITY_SERVICE);

        NetworkInfo networkInfo = connMgr.getActiveNetworkInfo();

        if (networkInfo != null && networkInfo.isConnected()) {
api();
        } else {
            Toast.makeText(getContext(), "Connection Failed", Toast.LENGTH_SHORT).show();
    }



    }



    void api() {
        dialog.show();
        kidid=appPreferences.getInt("kid_id");
        Log.e("kidid",kidid+"");
        modelhomes = new ArrayList<>();
        random = new Random();
        try {

            final API_interface api = Api_client.getMessage().create(API_interface.class);
            Call<Mod_Message> call = api.MessageModelCall(kidid, pos, length);
            Log.e("response:", "");
            call.enqueue(new retrofit2.Callback<Mod_Message>() {
                @Override
                public void onResponse(Call<Mod_Message> call, Response<Mod_Message> response) {
                    if (response.isSuccess()) {
                        if (response.body().getMsg().equals("Successful")) {
                            if (!(response.body().getUserData().isEmpty())) {

                                student_details = response.body().getUserData();

                                Log.e("response", " :" + student_details);

                                for (int i = 0; i < student_details.size(); i++) {
                                    if (student_details.get(i).getRole().equals("Parent") && student_details.get(i).getStatus() == 0) {

                                        String subject = student_details.get(i).getSubject();


                                        String description = student_details.get(i).getDescription();

                                        String filepath = student_details.get(i).getFilePath();
                                        String time = student_details.get(i).getTimeStamp();

                                        model_adapter s = new model_adapter();
                                        s.setsubject(subject);
                                        s.setdescription(description);
                                        s.setfilepath(filepath);
                                        s.settime(time);
                                        modelhomes.add(s);


                                    }
                                }

                                if (modelhomes.size() > 0) {
                                    recyclerView.setHasFixedSize(true);

                                    recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
                                    contactAdapter = new CardViewDataAdapter_message(recyclerView, modelhomes, getActivity());
                                    recyclerView.setAdapter(contactAdapter);

                                    contactAdapter.setOnLoadMoreListener(new OnLoadMoreListener() {
                                        @Override
                                        public void onLoadMore() {

                                            if (modelhomes.size() > 0) {

                                                modelhomes.add(null);
                                                contactAdapter.notifyItemInserted(modelhomes.size() - 1);
                                                new Handler().postDelayed(new Runnable() {
                                                    @Override
                                                    public void run() {

                                                        modelhomes.remove(modelhomes.size() - 1);
                                                        Log.e("modelhomes.size() - 1", " :" + modelhomes);
                                                        contactAdapter.notifyItemRemoved(modelhomes.size());
                                                        Log.e("modelhomes.size()", " :" + modelhomes.size());
                                                        //Generating more data
                                                        length = length + 1;
                                                        Log.e("posw", " :" + position);
                                                        final int end = modelhomes.size() + 10;
                                                        Log.e("end", " :" + end);
                                                        final API_interface api = Api_client.getMessage().create(API_interface.class);
                                                        Call<Mod_Message> call = api.MessageModelCall(appPreferences.getInt("kid_id"), pos, length);
                                                        call.enqueue(new retrofit2.Callback<Mod_Message>() {

                                                            @Override
                                                            public void onResponse(Call<Mod_Message> call, Response<Mod_Message> response) {
                                                                dialog.dismiss();
                                                                if (response.isSuccess()) {
                                                                    Log.e("response:", response.body().getMsg() + "");

                                                                    if (response.body().getMsg().equals("Successful")) {
                                                                        List<Mod_Message.UserDataBean> student_details = response.body().getUserData();
                                                                        Log.e("response", " :" + student_details);

                                                                        for (int i = 0; i < student_details.size(); i++) {
                                                                            if (student_details.get(i).getRole().equals("Parent") && student_details.get(i).getStatus() == 0) {

                                                                                String subject = student_details.get(i).getSubject();


                                                                                String description = student_details.get(i).getDescription();

                                                                                String filepath = student_details.get(i).getFilePath();
                                                                                model_adapter s = new model_adapter();
                                                                                s.setsubject(subject);
                                                                                s.setdescription(description);
                                                                                s.setfilepath(filepath);
                                                                                modelhomes.add(s);
                                                                            }
                                                                        }


                                                                        contactAdapter.notifyDataSetChanged();
                                                                        contactAdapter.setLoaded();
                                                                    }

                                                                }
                                                            }

                                                            @Override
                                                            public void onFailure(Call<Mod_Message> call, Throwable t) {

                                                                Toast.makeText(getContext(), "failed", Toast.LENGTH_SHORT).show();
                                                            }

                                                        });

//
                                                    }
                                                }, 5000);
                                            } else {
                                                Toast.makeText(getContext(), "Loading data completed", Toast.LENGTH_SHORT).show();
                                            }
                                        }
                                    });
                                } else {
                                    dialog.dismiss();
                                    length = length + 1;
                                    api();
                                }


                                dialog.dismiss();

                            }
                            else if(response.body().getUserData().isEmpty()){
                                dialog.dismiss();
                                Toast.makeText(getContext(), "No Mesages", Toast.LENGTH_SHORT).show();

                            }
                        }
                        else {

                            dialog.dismiss();
                            Toast.makeText(getContext(), response.body().getMsg(), Toast.LENGTH_SHORT).show();
                        }
                    } else {

                        dialog.dismiss();
                        Toast.makeText(getContext(), "error", Toast.LENGTH_SHORT).show();
                    }
                }

                @Override
                public void onFailure(Call<Mod_Message> call, Throwable t) {
                    dialog.dismiss();
                    Log.e("response:", t.getMessage());
                    t.printStackTrace();
                    Toast.makeText(getContext(), "failed", Toast.LENGTH_SHORT).show();
                }

            });
        } catch (NullPointerException e) {
            Toast.makeText(getContext(), e+"", Toast.LENGTH_SHORT).show();

        }


    }

}
