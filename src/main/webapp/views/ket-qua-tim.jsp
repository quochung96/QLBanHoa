<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<div class="container-fluid">
	<div class="row">
		<div class="col-sm-2" style="background-color:#59961F;height:100%;">
			<jsp:include page="thuc-don.jsp?kieu=thuc-don-dung" />
		</div>
		<div class="col-sm-10">
			<c:if test="${soHoaTimThay>0}">
				<fmt:setLocale value="vi-VN" />
				<h3>KẾT QUẢ TÌM KIẾM</h3>
				<c:forEach items="${dsh}" var="hoa">
					<div style="width:350px;height:150px;display:inline-block;">
						<p style="max-width:40%;height:auto;float:left;padding:5px;">
							<img src="images/${hoa.hinh }" style="width:100%;height:150px" />
						</p>
						<div style="max-width:60%;height:auto;float:left;padding:5px;">
							<p><i>Tên bó hoa: </i><b>${hoa.tenhoa}</b></p>
							<fmt:formatNumber value="${hoa.dongia }" type="number" var="donGia"/>
							<p><i>Giá bán:</i> ${hoa.dongia} đ</p>
							<p><i>Thành phần chính:</i><br>${hoa.mota}</p>
						</div>
					</div>		
				</c:forEach>
				<div style="clear:both;"></div>
			</c:if>
		</div>
		
	</div>
</div>