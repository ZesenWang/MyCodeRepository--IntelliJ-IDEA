<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<body>
<h2>Hello World!</h2>
<s:form action="doUpload" method="post" enctype="multipart/form-data">
    <s:file name="upload" label="File"/>
    <s:property value="fileMessage"/>
    <s:submit/>
</s:form>
</body>
</html>
