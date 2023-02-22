package com.sample.service;

import org.springframework.stereotype.Service;

import com.sample.domain.InvestigateVO;

@Service
public class InvestigateServiceImpl implements InvestigateService{
	
	

	
	public InvestigateVO result(InvestigateVO vo) {
		InvestigateVO result = new InvestigateVO();
		
		int selePrice= vo.getSelePrice();
		int rentalPrice= vo.getRentalPrice();
		int debtPrice=vo.getDebt(); 
		

		if(vo.isIligalRone()) {
			result.setResult1("정상적인 중개사는 대출중개를 하지않아요");
		}
		if(rentalPrice>=selePrice) {
			result.setResult2("분양가("+selePrice+")와 전세가("+rentalPrice+")가 같거다 더 많다면 문제가 생겼을떄 돈을 받지 못할수 있어요");			
		}
		if(!vo.isProhibition()) {
			result.setResult3("전세 계약 이전 권리권동 관련금지에 관한 사항을 설정해야 임대인이 바로 보증금을 줄수없는 사람에게 매각하는 경우를 막을수있어요");
		}
		
		if(!vo.isDocument()) {
			result.setResult4("등기부 등본 갑구 을구 또는 신탁회사가 있는지 반드시 확인해야합니다");
		}
		if(vo.isDangerRegion()) {
			result.setResult5("표시된 지역은 전세사기 위험구역으로 지정된곳입니다 전세 특히 빌라의경우 더 꼼꼼하게 확인하세요");
		}
		if(!vo.isRealtor()) {
			result.setResult6("위 사이트에서는 중개인의 경력 위치 중개 보조인등을 확인할수 있어요 반드시 인증된 중개사와 계약하세요");
		}
		if(debtPrice+rentalPrice >= selePrice) {
			result.setResult7("문제가 생겼을떄 받을돈은 건물 매매가("+selePrice+")- 우선순위 근저당("+debtPrice+")입니다내 보증금과 근저당의 합이 건물가의 70%가 넘으면 위험해요");
		}
		if(!vo.isInsurance()) {
			result.setResult8("보증보험은 문제가 생기면 전세보증금을 대신 돌려줍니다 해당 물건이 보증보험이 가능 한지 반드시 중개인한테 확인하세요 ");
		}
		
		
		return result;
		
	}
}
