package com.schoolmanapp.shantigirischool.school.parent.model_class;

public class ExamResultModel {

    /**
     * msg : Success
     * status : true
     * results :
     <!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
     <html xmlns="http://www.w3.org/1999/xhtml">
     <head>
     <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
     <title>Report Card</title>
     <link href="https://fonts.googleapis.com/css?family=Montserrat:400,500,600,700,800" rel="stylesheet" />
     <style>
     body {
     font-family: 'Montserrat', sans-serif;
     }

     h1, h2, h3, h4, h5, h6, ul, ol, p, a, strong, span {
     margin: 0;
     padding: 0;
     }

     .main-wrapper {
     width: 900px;
     height: auto;
     margin: auto;
     border: 3px solid #23713d;
     padding: 30px 50px;
     }

     .wrapper-header {
     width: 100%;
     display: inline-block;
     }

     .logo img {
     float: left;
     }

     .header-txts {
     width: calc(100% - 280px);
     float: left;
     text-align: center;
     padding-top: 8px;
     }

     .header-txts h2 {
     font-weight: 800;
     font-size: 32px;
     }

     .header-txts h4 {
     padding: 3px 0px;
     font-weight: 600;
     }

     .header-txts-full {
     width: 100% !important;
     }

     .student-info {
     width: 50%;
     float: left;
     margin-top: 20px;
     }

     .s-info {
     width: 100%;
     display: block;
     margin-bottom: 12px;
     }

     .s-info span {
     width: 162px;
     display: inline-block;
     font-weight: 600;
     }

     .s-info input {
     width: calc(100% - 202px);
     border: none;
     border-bottom: 2px solid #000;
     outline: none;
     padding: 2px 4px;
     font-size: 16px;
     font-weight: bold;
     }

     .rollNumb {
     border: 2px solid #000;
     display: inline-block;
     margin-bottom: 32px;
     }

     .rollNumb span {
     padding: 6px 20px;
     display: inline-block;
     font-weight: bold;
     }

     .rollNumb span:first-child {
     border-right: 2px solid #000;
     color: #5e1e02;
     background: #f6fd9d;
     }

     .pad1 {
     float: right;
     margin-top: 5px;
     }

     .tables {
     margin-top: 18px;
     margin-bottom: 10px;
     }

     .tables table {
     width: 100%;
     border-collapse: collapse;
     }

     .tables table, th, td {
     border: 2px solid #000;
     padding: 8px;
     font-weight: bold;
     }

     .tables table tfoot td {
     font-weight: normal;
     font-style: italic;
     }

     .yellow-highlight {
     background: #faffa1;
     }

     .blue-highlight {
     background: #cdffff;
     }

     .grades {
     margin-right: 20px;
     }

     .grades:last-child {
     margin-right: 0px;
     }

     .grades span:first-child {
     background: #fdd8bb !important;
     }

     .foot-info {
     margin-top: 50px;
     margin-bottom: 80px;
     font-weight: bold;
     font-size: 18px;
     }

     .foot-cr {
     width: 30%;
     float: left;
     font-weight: 600;
     text-align: center;
     margin-bottom: 20px;
     }
     </style>
     </head>

     <body>
     <div style="height:30px;">
     <button type="button" class="btn btn-success btn-style" id="btn-print" style="margin-top:20px;float:right;height: 100%; width: 6%;background-color: #0ce40c; margin-right:10px;" onclick="myFunction()">Print</button>
     </div>
     <div class="main-wrapper">
     <div class="wrapper-header logo">
     <img src=http://www.schoolman.in/Media/School/Logo/TESTed4f4657-448d-40ac-8b31-b1bab72794df.jpeg width="150" />
     <div class="header-txts">
     <h2>Govt. VHSS Kanakkary </h2>

     <h4>Kanakkary</h4>
     </div>
     </div>

     <div class="wrapper-header">
     <div class="header-txts header-txts-full">
     <h2>Report Card</h2>
     <h3>Class : II A</h3>
     <h3>Academic Session: 2018 - 2019</h3>
     </div>
     </div>

     <div class="wrapper-header">
     <div class="student-info">
     <div class="s-info">
     <span>Student's Name</span>
     <input type="text" value=Reshma />
     </div>
     <div class="s-info">
     <span>Parent's Name</span>
     <input type="text" value=Raj />
     </div>

     <div class="s-info">
     <span>Date of Birth</span>
     <input type="text" value= />
     </div>
     </div><!-- ./student-info -->
     <div class="student-info">
     <div class="pad1">
     <div class="rollNumb">
     <span>Roll No.</span>
     <span></span>
     </div>
     <div class="s-info">
     <span>Admission No.</span>
     <input type="text" value=25252 />
     </div>
     </div>
     </div><!-- ./student-info -->

     <div class="student-info" style="width:100%; margin-top:2px;">
     <div class="s-info">
     <span>Address</span>
     <input type="text" />
     </div>
     </div><!-- ./student-info -->
     </div><!-- ./wrapper-header -->

     <div class="wrapper-header">
     <div class="tables">
     <table>
     <thead class="yellow-highlight">
     <tr>
     <th rowspan="2">Scholastic Area</th>
     <th rowspan="2" colspan="3">Term 1</th>
     <th rowspan="2" colspan="3"></th>

     <th colspan="3">Overall</th>
     </tr>
     <tr>
     <th colspan="3">Term 1+</th>

     </tr>
     </thead>
     <tbody class="blue-highlight">
     <tr>
     <th rowspan="2">Subjects</th>
     <th>Internal</th>
     <th>External</th>
     <th>Total</th>
     <th>Internal</th>
     <th>External</th>
     <th>Total</th>

     <th>Grand Total</th>
     <th rowspan="2">Grade</th>

     </tr>
     </tbody>
     <tbody>

     <tr>
     <td>Checmistry                                                         </td>
     <td style="font-size:11.5px;">0/20.00     </td>
     <td style="font-size:11.5px;">0/30.00     </td>
     <td style="font-size:11.5px;">0   /50.00        </td>
     <td style="font-size:11.5px;">0/0     </td>
     <td style="font-size:11.5px;">0/0     </td>
     <td style="font-size:11.5px;">0   /0        </td>

     <td style="font-size:11.5px;">0 /50.00      </td>
     <td>E                                                           </td>

     </tr>
     <tr>
     <td>English                                                         </td>
     <td style="font-size:11.5px;">0/20.00     </td>
     <td style="font-size:11.5px;">0/30.00     </td>
     <td style="font-size:11.5px;">0   /50.00        </td>
     <td style="font-size:11.5px;">0/0     </td>
     <td style="font-size:11.5px;">0/0     </td>
     <td style="font-size:11.5px;">0   /0        </td>

     <td style="font-size:11.5px;">0 /50.00      </td>
     <td>E                                                           </td>

     </tr>
     <tr>
     <td>Mathematics                                                         </td>
     <td style="font-size:11.5px;">0/20.00     </td>
     <td style="font-size:11.5px;">0/80.00     </td>
     <td style="font-size:11.5px;">0   /100.00        </td>
     <td style="font-size:11.5px;">0/0     </td>
     <td style="font-size:11.5px;">0/0     </td>
     <td style="font-size:11.5px;">0   /0        </td>

     <td style="font-size:11.5px;">0 /100.00      </td>
     <td>E                                                           </td>

     </tr>

     </tbody>
     <tfoot>
     <tr>
     <td colspan="10" align="center"><strong>8 Point Grading Scale</strong>: A1(91% - 100%), A2(81% - 90%), B1(71% - 80%), B2(61% - 70%), C1(51% - 60%), C2(41% - 50%), D(33% - 40%), E(32% & Below) *SE=Sub Enrichment</td>
     </tr>
     </tfoot>
     </table>
     </div>
     </div><!-- ./wrapper-header -->

     <div class="wrapper-header">
     <div class="rollNumb grades">
     <span>Overall Marks</span>
     <span>0/200.00</span>
     </div>

     <div class="rollNumb grades">
     <span>Percentage</span>
     <span>0.00  </span>
     </div>

     <div class="rollNumb grades">
     <span>Grade</span>
     <span>E</span>
     </div>

     <div class="rollNumb grades">
     <span>Rank</span>
     <span>1</span>
     </div>
     </div><!-- ./wrapper-header -->

     <div class="wrapper-header">
     <div class="student-info" style="width:50%; margin-top:2px;">
     <div class="s-info">
     <span style="width:120px;">Attendance :</span>
     <span style="width:120px; font-weight:bold;">0 : 0 </span>

     </div>
     </div><!-- ./student-info -->
     <div class="student-info" style="width:50%; margin-top:2px;">
     <div class="s-info">
     <span style="width:100px;">Remarks :</span>
     <input type="text" />
     </div>
     </div><!-- ./student-info -->
     </div><!-- ./wrapper-header -->

     <div class="wrapper-header">
     <div class="foot-info">

     </div>
     </div><!-- ./wrapper-header -->

     <div class="wrapper-header">
     <div class="foot-cr">
     <span>Date: 2019-05-31</span>
     </div>
     <div class="foot-cr">
     <span>Class Teacher</span>
     </div>
     <div class="foot-cr">
     <span>Principal</span>
     </div>
     </div><!-- ./wrapper-header -->

     </div><!-- ./main-wrapper -->

     </body>
     </html>
     <script>
     function myFunction() {
     var printButton = document.getElementById("btn-print");
     printButton.style.visibility = 'hidden';
     window.print();
     printButton.style.visibility = 'visible';
     }
     </script>

     */

    private String msg;
    private boolean status;
    private String results;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getResults() {
        return results;
    }

    public void setResults(String results) {
        this.results = results;
    }
}
