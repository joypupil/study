<#import "common/layout.ftl" as l>
<@l.layout>
	index page info test
	<form method="POST" enctype="multipart/form-data"
		action="/batch/upload">
		File to upload: <input type="file" name="file"><br /> File to
		upload: <input type="file" name="file"><br /> 
		<input type="text" name="name"><br/>
		<input type="text" name="text"><br/>
		<input type="text" name="password"><br/>
		<input type="submit" value="Upload"> Press here to upload the file!
	</form>
</@l.layout>
