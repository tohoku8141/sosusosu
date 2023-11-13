import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class PrimeNumberQuizServlet extends HttpServlet {
    private Random random = new Random();
    private int currentNumber = random.nextInt(100); // 0から99の乱数

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String isPrime = request.getParameter("isPrime");
        boolean correct = isPrime.equals(String.valueOf(is
Prime(currentNumber)));
out.println("<html><body>");
        out.println("<h1>素数クイズ結果</h1>");
        out.println("<p>判定された数字: " + currentNumber + "</p>");
        out.println("<p>あなたの回答: " + (correct ? "正解" : "不正解") + "</p>");
currentNumber = random.nextInt(100);
        out.println("<p>新しいクイズ:</p>");
        out.println("<p id='number'>" + currentNumber + "</p>");
        out.println("<input type='hidden' id='hiddenNumber' name='hiddenNumber' value='" + currentNumber + "'>");
        out.println("<form action='PrimeNumberQuizServlet' method='post'>");
        out.println("<label><input type='radio' name='isPrime' value='true'> 素数</label>");
out.println("<label><input type='radio' name='isPrime' value='false'> 素数でない</label>");
        out.println("<input type='submit' value='送信'>");
        out.println("</form>");

        out.println("</body></html>");
    }
private boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }
        for (int i = 2; i * i <= number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
