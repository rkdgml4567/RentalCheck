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
			result.setResult1("�������� �߰���� �����߰��� �����ʾƿ�");
		}
		if(rentalPrice>=selePrice) {
			result.setResult2("�о簡("+selePrice+")�� ������("+rentalPrice+")�� ���Ŵ� �� ���ٸ� ������ �������� ���� ���� ���Ҽ� �־��");			
		}
		if(!vo.isProhibition()) {
			result.setResult3("���� ��� ���� �Ǹ��ǵ� ���ñ����� ���� ������ �����ؾ� �Ӵ����� �ٷ� �������� �ټ����� ������� �Ű��ϴ� ��츦 �������־��");
		}
		
		if(!vo.isDocument()) {
			result.setResult4("���� � ���� ���� �Ǵ� ��Źȸ�簡 �ִ��� �ݵ�� Ȯ���ؾ��մϴ�");
		}
		if(vo.isDangerRegion()) {
			result.setResult5("ǥ�õ� ������ ������� ���豸������ �����Ȱ��Դϴ� ���� Ư�� �����ǰ�� �� �Ĳ��ϰ� Ȯ���ϼ���");
		}
		if(!vo.isRealtor()) {
			result.setResult6("�� ����Ʈ������ �߰����� ��� ��ġ �߰� �����ε��� Ȯ���Ҽ� �־�� �ݵ�� ������ �߰���� ����ϼ���");
		}
		if(debtPrice+rentalPrice >= selePrice) {
			result.setResult7("������ �������� �������� �ǹ� �ŸŰ�("+selePrice+")- �켱���� ������("+debtPrice+")�Դϴٳ� �����ݰ� �������� ���� �ǹ����� 70%�� ������ �����ؿ�");
		}
		if(!vo.isInsurance()) {
			result.setResult8("���������� ������ ����� ������������ ��� �����ݴϴ� �ش� ������ ���������� ���� ���� �ݵ�� �߰������� Ȯ���ϼ��� ");
		}
		
		
		return result;
		
	}
}
