package com.joypupil.study.kafka;

import java.util.Properties;

import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerRecord;

public class KafkaConsumerProducerDemo
{
    public static void main(String[] args)
    {
    	 Properties props = new Properties();
    	 props.put("bootstrap.servers", "192.168.21.128:9092");
    	 props.put("acks", "all");
    	 props.put("retries", 0);
    	 props.put("batch.size", 16384);
    	 props.put("linger.ms", 1);
    	 props.put("buffer.memory", 33554432);
    	 props.put("key.serializer", "org.apache.kafka.common.serialization.StringSerializer");
    	 props.put("value.serializer", "org.apache.kafka.common.serialization.StringSerializer");
        KafkaProducer<String, String> producer = new KafkaProducer<String, String>(props);
        for(int i = 0; i < 100; i++){
        	producer.send(new ProducerRecord<String, String>("my-topic","testaa" + Integer.toString(i),"test" + Integer.toString(i)));
        }
        producer.close();
//        KafkaConsumer consumerThread = new KafkaConsumer(KafkaProperties.topic);
//        consumerThread.start();
    }
}