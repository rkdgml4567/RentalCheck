<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ include file="../includes/header.jsp" %>
<div class="checkBoxForm">
<h1>안심전세계약 Check List</h1>

<form method="get" action="/main/result" >
      <p>1)중개인으로부터 불법적인 대출 중개를 받은적이 있나오?</p>
      <label><input type="radio" name="iligalRone" value="true"> 그렇다</label>
      <label><input type="radio" name="iligalRone" value="false"> 아니다</label>
       <p>2)해당 계약 주택(혹은 인근)의 분양가와 전세가를 입력해주세요 (<a href="https://data.kbland.kr/aimap" target='_blank'>*열람하기)</a></p>
      <label>분양가:<input type="number" name="selePrice" value="sele" required="required"></label>
      <label>전세가:<input type="number" name="rentalPrice" value="rental"required="required"></label>
       <p>3)전세계약서에 계약이전 이후 1주일간 권리변동 금지에 관한 사항이 있나요? </p>
      <label><input type="radio" name="prohibition" value="true"> 그렇다</label>
      <label><input type="radio" name="prohibition" value="false"> 아니다</label>
       <p>4)해당 주택의 등기부 등본 열람 여부</p>
      <label><input type="radio" name="document" value="true"> 그렇다</label>
      <label><input type="radio" name="document" value="false"> 아니다</label>
       <p>5)전세 계약 예정지가 아래 표시된 지역인가요?</p>
       <ui>
       		<li>서울특별시 강서구 화곡동</li>
       		<li>서울특별시 양천구 신월동	</li>
       		<li>서울특별시 금천구 독산동	</li>
       		<li>서울특별시 관악구 신림동</li>
       		<li>서울특별시 강서구 등촌동</li>
       		<br>
       	</ui>
      <label><input type="radio" name="dangerRegion" value="true"> 그렇다</label>
      <label><input type="radio" name="dangerRegion" value="false"> 아니다</label>
       <p>6)다음 링크에서 본인 집을 중계하는 공인중개사의 정보를 열람할수 있나요? (<a href="http://www.nsdi.go.kr/lxportal/?menuno=4085" target='_blank'>*열람하기)</a></p>
       
      <label><input type="radio" name="realtor" value="true"> 그렇다</label>
      <label><input type="radio" name="realtor" value="false"> 아니다</label>
       <p>7)해당 물건의  근저당 금액을 입력해주세요</p>
     <label><input type="number" name="debt" name="debt" required="required"> 전세가</label>
      <p>8)해당 물건의  보증보험 가입 가능 여부</p>
      <label><input type="radio" name="insurance" value="true"> 그렇다</label>
      <label><input type="radio" name="insurance" value="false"> 아니다</label>
      <p><input type="submit" value="결과보기"> 
    </form>
    </div>

<%@ include file="../includes/footer.jsp" %>
</html>