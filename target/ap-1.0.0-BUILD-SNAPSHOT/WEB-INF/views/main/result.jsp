<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt"%>
 
    
<%@ include file="../includes/header.jsp" %>


<div class="checkBoxForm">
<h1>아래 사항을 계약전 반드시 확인하세요!</h1>

						<ul>
							 <c:if test="${not empty result.result1}">
   						     <li>${result.result1}</li><br>
   							 </c:if>
   							  <c:if test="${not empty result.result2}">
   						     <li>${result.result2}</li><br>
   							 </c:if>
   							  <c:if test="${not empty result.result3}">
   						     <li>${result.result3}</li><br>
   							 </c:if>
   							  <c:if test="${not empty result.result4}">
   						     <li>${result.result4}</li><br>
   							 </c:if>
   							  <c:if test="${not empty result.result5}">
   						     <li>${result.result5}</li><br>
   							 </c:if>
   							  <c:if test="${not empty result.result6}">
   						     <li>${result.result6}</li><br>
   							 </c:if>
   							  <c:if test="${not empty result.result7}">
   						     <li>${result.result7}</li><br>
   							 </c:if>
   							  <c:if test="${not empty result.result8}">
   						     <li>${result.result8}</li><br>
   							 </c:if>
						</ul>
					
					
</div>
</body>
<%@ include file="../includes/footer.jsp" %>
</html>