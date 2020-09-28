# log4j-no-fixed-work-flie
log4j will write log on dynamic file whose names has been formatted by "DatePattern :

log4j.rootLogger = info,stdout,D

log4j.appender.D.File =D:\\ftplog\\
log4j.appender.D.Append = true
log4j.appender.D.Threshold = INFO
log4j.appender.D.MaxFileSize =1024MB
log4j.appender.D.DatePattern =yyyyMMdd'\\test_%s.log'
log4j.appender.D.layout = org.apache.log4j.PatternLayout
log4j.appender.D.layout.ConversionPattern =%m%n