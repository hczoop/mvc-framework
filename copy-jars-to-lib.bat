@echo off
echo ------------------------------------
echo �������µ�������jar�����������Ƶ�src/main/webapp/WEB-INF/lib��
echo current path is : %~dp0
echo ------------------------------------
set MVN=mvn
set MAVEN_OPTS=%MAVEN_OPTS% -XX:MaxPermSize=128m

pushd %~dp0
:: ɾ�� ����.jar �ļ�
call del /f /s /q *.jar

call %MVN%  dependency:copy-dependencies -DoutputDirectory=src/main/webapp/WEB-INF/lib 
if errorlevel 1 goto error

echo ------------------------------------
echo ������jar����src/main/webapp/WEB-INF/lib��!
echo ------------------------------------

goto end


:error
echo Error Happen!!!
:end
pause