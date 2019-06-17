package com.biz.inout.service;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

import com.biz.inout.model.InoutDTO;
import com.biz.inout.model.InoutVO;

public class InoutService_02 {
	List<InoutVO> ioList = new ArrayList<InoutVO>();
	List<InoutDTO> dtoList = new ArrayList<InoutDTO>();
	String inoutFile = "src/com/biz/inout/매입매출.txt";
	FileReader fileReader;
	BufferedReader buffer;

	public void readInout() throws FileNotFoundException {

		try {

			fileReader = new FileReader(inoutFile);
			buffer = new BufferedReader(fileReader);
			String reader = "";

			while (true) {
				InoutVO vo = new InoutVO();

				reader = buffer.readLine();
				if (reader == null)
					break;

				String[] inouts = reader.split(":");

				String day = inouts[0];
				String goods = inouts[1];
				String inout = inouts[2];
				int price = Integer.valueOf(inouts[3]);
				int amount = Integer.valueOf(inouts[4]);

				vo.setDay(day);
				vo.setGoods(goods);
				vo.setInout(inout);
				vo.setPrice(price);
				vo.setAmount(amount);

				ioList.add(vo);

			}

		} catch (Exception e) {

		}

	}

	public void dto() {
		for (InoutVO vo : ioList) {
			InoutDTO dto = new InoutDTO();
			dto.setDay(vo.getDay());
			dto.setGoods(vo.getGoods());
			dto.setInout(vo.getInout());
			dto.setPrice(vo.getPrice());
			dto.setAmount(vo.getAmount());
			
			if(vo.getInout().equals("1")) {
				dto.setInout("매입");
				dto.setInTotal(vo.getPrice()*vo.getAmount());
			} else {
				dto.setInout("매출");
				dto.setOutTotal(vo.getPrice()*vo.getAmount());
			}
			
			dtoList.add(dto);
		}
	}


	public void viewInout() {
		System.out.println("매입매출 리스트");
		System.out.println("========================================================================================");
		System.out.println("거래일자\t구분\t상품명\t\t단가\t수량\t매입금액\t매출금액");
		System.out.println("----------------------------------------------------------------------------------------");
		for (InoutDTO dto : dtoList) {
			System.out.printf("%s\t%s\t%s\t%d\t%d\t%d\t%d\n", dto.getDay(), dto.getInout(), dto.getGoods(),
					dto.getPrice(), dto.getAmount(), dto.getInTotal(), dto.getOutTotal());
		}
		System.out.println("========================================================================================");

	}

}
