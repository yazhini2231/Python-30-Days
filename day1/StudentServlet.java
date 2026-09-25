import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/StudentServlet")
public class StudentServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request,
                         HttpServletResponse response)
                         throws IOException {

        response.setContentType("text/html;charset=UTF-8");

        PrintWriter out = response.getWriter();

        String id = request.getParameter("id");

        // AJAX request
        if (id != null) {

            if (id.equals("101")) {
                out.print(
                    "<h3>Student Found</h3>" +
                    "ID: 101<br>" +
                    "Name: Yazhini<br>" +
                    "Department: Information Technology<br>" +
                    "Mark: 85"
                );
            }

            else if (id.equals("102")) {
                out.print(
                    "<h3>Student Found</h3>" +
                    "ID: 102<br>" +
                    "Name: Anitha<br>" +
                    "Department: Computer Science<br>" +
                    "Mark: 90"
                );
            }

            else if (id.equals("103")) {
                out.print(
                    "<h3>Student Found</h3>" +
                    "ID: 103<br>" +
                    "Name: Priya<br>" +
                    "Department: Information Technology<br>" +
                    "Mark: 78"
                );
            }

            else {
                out.print("<h3>No Student Found</h3>");
            }

            return;
        }

        // Complete webpage
        out.println("""
        <!DOCTYPE html>
        <html>
        <head>

        <title>AJAX Student Search</title>

        <style>

        body {
            font-family: Arial;
            background: #e8f0f7;
            text-align: center;
            padding-top: 70px;
        }

        .box {
            width: 450px;
            margin: auto;
            padding: 30px;
            background: white;
            border-radius: 15px;
            box-shadow: 0 5px 20px gray;
        }

        h1 {
            color: #174a7e;
        }

        input {
            width: 80%;
            padding: 12px;
            font-size: 16px;
            border: 1px solid gray;
            border-radius: 6px;
        }

        button {
            padding: 12px 25px;
            margin-top: 15px;
            background: #174a7e;
            color: white;
            border: none;
            border-radius: 6px;
            cursor: pointer;
        }

        #result {
            margin-top: 25px;
            padding: 20px;
            background: #f5f5f5;
            text-align: left;
            border-radius: 8px;
        }

        </style>

        <script>

        function searchStudent() {

            var id = document.getElementById("studentId").value;

            if (id == "") {
                document.getElementById("result").innerHTML =
                    "Please enter Student ID";
                return;
            }

            var xhr = new XMLHttpRequest();

            xhr.open(
                "GET",
                "StudentServlet?id=" + id,
                true
            );

            xhr.onload = function() {

                if (xhr.status == 200) {

                    document.getElementById("result").innerHTML =
                        xhr.responseText;

                } else {

                    document.getElementById("result").innerHTML =
                        "Server Error";
                }
            };

            xhr.send();
        }

        </script>

        </head>

        <body>

        <div class="box">

        <h1>Student Search System</h1>

        <p>AJAX Based Student Search</p>

        <input type="text"
               id="studentId"
               placeholder="Enter Student ID">

        <br>

        <button onclick="searchStudent()">
            Search
        </button>

        <div id="result">
            Search result will appear here
        </div>

        </div>

        </body>
        </html>
        """);
    }
}