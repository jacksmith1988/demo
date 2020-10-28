package com.tracy.demo;

import com.tracy.demo.dao.CreditLogRepository;
import com.tracy.demo.dao.CustomerRepository;
import com.tracy.demo.entity.TCreditLogs;
import com.tracy.demo.entity.TCustomers;
import org.joda.time.DateTime;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.sql.Timestamp;

@RunWith(SpringJUnit4ClassRunner.class)
@TestPropertySource(locations = {"classpath:application.properties"})
@SpringBootTest
public class MyTest {
	
	@Autowired
	private CreditLogRepository creditLogRepository;
	@Autowired
	private CustomerRepository customerReportRepository;
	

	@Test
	public void testSc () throws Exception
	{
		TCreditLogs tCreditLogs = new TCreditLogs();
		tCreditLogs.setAmount(1d);
		tCreditLogs.setFlag("0");
		tCreditLogs.setCreatedBy("tracy");
		tCreditLogs.setCreatedDate(new Timestamp(DateTime.now().toDate().getTime()));
		tCreditLogs.setCreditMode("1");
		tCreditLogs.setCurrency("123");
		tCreditLogs.setDstAmount(2d);
		tCreditLogs.setSrcAmount(1d);
		tCreditLogs.setTransCode("123");
		TCustomers customers = new TCustomers();
		customers.setCustomerId(1);
		customers.setVersion(1);
		customerReportRepository.save(customers);
		tCreditLogs.setTCustomers(customers);

		creditLogRepository.save(tCreditLogs);
	}

}
