<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<div class="container-fluid">
	<div class="row" style="background-color:#e6ffff;">
		<div class="col-sm-2">
			<h4 style="color:brown;">Danh sách loại</h4>
			<c:forEach items="${dslh }" var="lh" >
				<ul>
					<li><a href="trang-chu.jsp?maLoai=${lh.maloai}">${lh.tenloai }</a></li>
				</ul>
			</c:forEach>
		</div>
		<div class="col-sm-10" style="background-color:#FFF;">
			<c:forEach  items="${dsh}" var="h">
				<figure>
					<img src="images/${h.hinh }" />
					<figcaption>
					<p><b><a href="#">${h.tenhoa}</b><a href="ThemGioHangServlet?maHoa=${h.mahoa}"><img src="images/gio_hang.jpg" style="width:20px;height:20px;"></a></p>
					<fmt:setLocale value="vi-VN"/>
					<fmt:formatNumber value="${h.dongia}" type="number" var="donGia"></fmt:formatNumber>
					<p><i>Giá bán:</i> ${h.dongia } đ</p>
					</figcaption>
				</figure>
			</c:forEach>
		</div>
	</div>
</div>

