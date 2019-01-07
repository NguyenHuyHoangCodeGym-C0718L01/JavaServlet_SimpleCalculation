import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "CalculatorServlet", urlPatterns = "/calculate")
public class CalculatorServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Float firstOperand = Float.parseFloat(request.getParameter("firstOperand"));
        Float secondOperand = Float.parseFloat(request.getParameter("secondOperand"));
        String operator = request.getParameter("operator");

        PrintWriter printWriter = response.getWriter();
        if(secondOperand == 0 && operator.equals("/")){
            printWriter.println("<html>");
            printWriter.println("<h1>Divide By Zero</h1>");
            printWriter.println("</html>");
        }else{
            double result = Calculator.calculate(firstOperand, secondOperand, operator);
            printWriter.println("<html>");
            printWriter.println("<h1>Result</h1>");
            printWriter.println("<h3>"+firstOperand+" "+operator+" "+secondOperand+" "+"="+" "+result+"</h3>");
            printWriter.println("</html>");
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
