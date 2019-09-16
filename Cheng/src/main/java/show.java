import org.apache.log4j.Logger;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**

 * Created by sai on 17-7-26.

 */
@WebServlet(name="show",urlPatterns="/show")
public class show extends HttpServlet{
    private static Logger logger=Logger.getLogger(show.class);
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
     logger.debug("This is a big bug");
     logger.info("This is info");
     logger.error("this is error");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


    }
}
