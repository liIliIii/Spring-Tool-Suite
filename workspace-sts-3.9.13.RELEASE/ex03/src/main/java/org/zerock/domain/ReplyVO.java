package org.zerock.domain;

import java.util.Date;

import lombok.Data;

@Data
// 댓글
public class ReplyVO {
	private Long rno;
	private Long bno;

	private String reply;
	private String replyer;
	private Date replyDate;
	private Date updateDate;
}
