log4j日志生成方式为：先写入到固定文件名为*.log的文件中，达到一定条件后将该文件重命名，然后再生成一个空的*.log文件，如此循环，
这种方式不利于以文件形式进行日志同步的方式，例如rsync等。
本功能参考RollingFileAppender，重写log4j的DailyRollingFileAppender.java类，支持按时间划分文件夹，并且支持限制单个文件大小，没有
固定工作文件，方便文件同步。

# log4j-no-fixed-work-flie
log4j will write log on dynamic file whose names has been formatted by "DatePattern :

log4j.rootLogger = info,stdout,D
log4j.appender.D=com.xsj.mylog4j.MyDailyRollingFileAppender
log4j.appender.D.File =D:\\ftplog\\
log4j.appender.D.Append = true
log4j.appender.D.Threshold = INFO
log4j.appender.D.MaxFileSize =1024MB
log4j.appender.D.DatePattern =yyyyMMdd'\\test_%s.log'
log4j.appender.D.layout = org.apache.log4j.PatternLayout
log4j.appender.D.layout.ConversionPattern =%m%n