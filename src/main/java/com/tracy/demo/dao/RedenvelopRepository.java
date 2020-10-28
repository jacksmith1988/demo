package com.tracy.demo.dao;

import com.tracy.demo.entity.TRedEnvelopeConfig;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.math.BigDecimal;
import java.sql.Timestamp;


public interface RedenvelopRepository  extends PagingAndSortingRepository<TRedEnvelopeConfig, BigDecimal>, JpaSpecificationExecutor<TRedEnvelopeConfig> {
	@Query(value="select min(ROUND(TO_NUMBER(to_date(effect_start_date,'hh24:mi:ss') - to_date(to_char(?1,'hh24:mi:ss'),'hh24:mi:ss')) * 24 * 60 * 60))  from T_RED_ENVELOPE_CONFIG "
			+"where to_date(to_char(?1,'hh24:mi:ss'),'hh24:mi:ss') < to_date(effect_start_date,'hh24:mi:ss') and flag = '1'",nativeQuery=true)
	public Long queryRemainTime(Timestamp time);
	
	@Query(value="select backurl from (select backurl from T_RED_ENVELOPE_CONFIG "
			+"where to_date(to_char(?1,'hh24:mi:ss'),'hh24:mi:ss') > to_date(effect_end_date,'hh24:mi:ss') and flag = '1' "
			+"order by to_date(effect_end_date,'hh24:mi:ss') desc) where rownum = 1",nativeQuery=true)
	public String queryBackUrl(Timestamp time);
	
	@Query(value="select backurl from T_RED_ENVELOPE_CONFIG t where effect_end_date = (select max(effect_end_date) from T_RED_ENVELOPE_CONFIG where flag = '1') and rownum = 1",nativeQuery=true)
	public String backUrlByMaxEffectEndDate();
}
