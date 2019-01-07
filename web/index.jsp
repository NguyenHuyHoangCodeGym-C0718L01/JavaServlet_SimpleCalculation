<%--
  Created by IntelliJ IDEA.
  User: hoangnhb
  Date: 07/01/2019
  Time: 16:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <h1>Simple Calculation</h1>
  <form action="/calculate" method="post">
    <div style="display:flex; margin-top: 5px">
      <label>First Operand: </label><br>
      <input style="margin-left: 30px" type="text" name="firstOperand" placeholder="Enter first operand: " value="1">
    </div>
    <div style="display: flex; margin-top: 5px">
      <label>Operator: </label><br>
      <select name="operator" style="margin-left: 58px">
        <option value="+">Addition</option>
        <option value="-">Minus</option>
        <option value="*">Mutiply</option>
        <option value="/">Divide</option>
      </select>
    </div>
    <div style="display:flex; margin-top: 5px">
      <label>Second Operand: </label><br>
      <input style="margin-left: 12px" type="text" name="secondOperand" placeholder="Enter second operand: " value="1">
    </div>
    <input type="submit" id="submit" value="Calculate" style="margin-top: 5px; margin-left: 119px">
  </form>
  </body>
</html>
