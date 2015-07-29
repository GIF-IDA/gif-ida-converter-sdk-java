@ECHO ON
call mvn clean
@ECHO ON
call mvn compile
@ECHO ON
call mvn compile -P generateSources

if errorlevel 0 goto postProcessSources
echo "ERROR copying and generating sources. Stopped execution"
goto eof

:postProcessSources
@ECHO ON
call mvn install -P postProcessSources
goto eof


:eof
