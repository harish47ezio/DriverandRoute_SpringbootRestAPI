package com.amdocs.entity;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;


import javax.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class Route {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "route_no")
	private long rnno;
	@Column(name = "StartPlace")
	private String startPlace;
	@Column(name = "Destination")
	private String destination;
	@Column(name = "start_date")
	@DateTimeFormat(pattern = "yyyy-mm-dd")
	@Temporal(TemporalType.DATE)
	private Date startDate;
	@Column(name = "end_date")
	@DateTimeFormat(pattern = "yyyy-mm-dd")
	@Temporal(TemporalType.DATE)
	private Date endDate;
	
	@ManyToOne
	@JoinColumn(name="drno")
	private Driver drivers;
}
