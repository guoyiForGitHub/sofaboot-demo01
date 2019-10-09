package com.scnx.sofa.demo.test;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import com.alipay.sofa.runtime.api.annotation.SofaReference;
import com.scnx.sofa.demo.service.SampleJvmService;

@SpringBootTest
@RunWith(SpringRunner.class)
public class TestSofa {
    
    @SofaReference(uniqueId="sampleJvmService01")
    private SampleJvmService client;
    
    @Test
    public void test01() {
        System.out.println(client.message());
    }
    
}
