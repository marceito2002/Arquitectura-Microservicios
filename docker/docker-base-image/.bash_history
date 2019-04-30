kafka-console-consumer --topic HDP_FW_TRACK --zookeeper mid1-db136hdpp-6.hd.docomodigital.com:2181/ddsfw -from-beginning
kafka-console-producer --broker-list mid1-db248hdflddsfwpp-1:9092 --topic HDP_FW_TRACK 
kafka-console-consumer --topic HDP_FW_TRACK --zookeeper mid1-db136hdpp-6.hd.docomodigital.com:2181/ddsfw -from-beginning 
kafka-console-consumer --topic HDP_FW_TRACK --zookeeper mid1-db136hdpp-6.hd.docomodigital.com:2181/ddsfw -from-beginning 
kafka-console-consumer --new-consumer --topic HDP_FW_TRACK --from-beginning --bootstrap-server mid1-db248hdflddsfwpp-1.hd.docomodigital.com:9092  --consumer.config client.properties
ls -la
