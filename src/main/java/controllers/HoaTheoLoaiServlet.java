package controllers;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import businessLogics.HoaBL;
import businessLogics.LoaiHoaBL;
import java.util.*;
import javaBeans.*;

@WebServlet("/HoaTheoLoaiServlet")
public class HoaTheoLoaiServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public HoaTheoLoaiServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<Hoa> dsh = HoaBL.docTatCa();
		List<LoaiHoa> dslh = LoaiHoaBL.docTatCa();
		if(request.getParameter("maLoai")!=null) {
			int maLoai = Integer.parseInt(request.getParameter("maLoai"));
			dsh = HoaBL.hoaTheoLoai(maLoai);
		}
			
		
		request.setAttribute("dslh", dslh);
		request.setAttribute("dsh", dsh);
		
		request.getRequestDispatcher("views/hoa-theo-loai.jsp").include(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
