<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>


<jsp:include page="/fragments/header.jsp"/>




<%--<section class="form--steps">--%>
<%--    <div class="form--steps-container">--%>
<%--        <form action="form-confirmation.html" method="post">--%>
<%--            <div data-step="4">--%>
<%--                <h3>Podaj adres oraz termin odbioru rzecz przez kuriera:</h3>--%>
<form:form action="add5" method="post" modelAttribute="donation">
                <div class="form-section form-section--columns">
                    <div class="form--steps-counter">Krok <span>3</span>/4</div>
                    <div class="form-section--column">
                        <h4>Adres odbioru</h4>
                        <div class="form-group form-group--inline">
                            <label> Ulica <form:input path="street" type="text" name="address"/> </label>
                        </div>

                        <div class="form-group form-group--inline">
                            <label> Miasto <form:input path="city" type="text" name="city"/> </label>
                        </div>

                        <div class="form-group form-group--inline">
                            <label>
                                Kod pocztowy <form:input path="zipCode" type="text" name="postcode"/>
                            </label>
                        </div>

                        <div class="form-group form-group--inline">
                            <label>
                                Numer telefonu <form:input path="phoneNumber" type="phone" name="phone"/>
                            </label>
                        </div>
                    </div>

                    <div class="form-section--column">
                        <h4>Termin odbioru</h4>
                        <div class="form-group form-group--inline">
                            <label> Data <form:input path="pickUpDate" type="date" name="data"/> </label>
                        </div>

                        <div class="form-group form-group--inline">
                            <label> Godzina <form:input path="pickUpTime" type="time" name="time"/> </label>
                        </div>

                        <div class="form-group form-group--inline">
                            <label>
                                Uwagi dla kuriera

                                    <form:textarea path="description" name="more_info" rows="5"/>
                            </label>
                        </div>
                    </div>
                </div>
                <div class="form-group form-group--buttons">
                    <button type="button" class="btn prev-step">Wstecz</button>
                    <button type="submit" class="btn next-step">Dalej</button>
                </div>
<%--            </div>--%>
<%--        </form>--%>
<%--    </div>--%>
<%--</section>--%>

</form:form>


<jsp:include page="/fragments/footer.jsp"/>
</section>
