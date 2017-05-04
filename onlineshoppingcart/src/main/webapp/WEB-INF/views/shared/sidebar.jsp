<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<div style="margin-bottom: 25px; padding-bottom: 50px; margin-left: 110px;">
<div class="list-group">
<c:forEach items="${categories}" var="category">
	<a href="${contextRoot}/show/category/${category.id}/products" class="list-group-item" id="a_${category.name}">${category.name}</a> 
	
</c:forEach>
</div>
</div>
