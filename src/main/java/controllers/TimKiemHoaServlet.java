package controllers;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.*;
import javaBeans.*;
import businessLogics.*;

@WebServlet("/TimKiemHoaServlet")
public class TimKiemHoaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public TimKiemHoaServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String tenHoa = request.getParameter("txtTenBoHoa");
		
		List<Hoa> dsh = HoaBL.timKiemHoa(tenHoa);
		
		request.setAttribute("dsh", dsh);
		request.setAttribute("soHoaTimThay", dsh.size());
		
		request.getRequestDispatcher("views/ket-qua-tim.jsp").include(request, response);
	}

}
