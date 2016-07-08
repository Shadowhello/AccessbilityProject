package com.xingqiba.accessbilityproject;

import android.accessibilityservice.AccessibilityService;
import android.accessibilityservice.AccessibilityServiceInfo;
import android.content.Intent;
import android.view.accessibility.AccessibilityEvent;

public class IAccessbilityService extends AccessibilityService {

	// ��������ֻ�����һ�������벿�ֻ��͵��ֻ���һ��
	private String[] packageNames = { "com.android.packageinstaller",
			"com.lenovo.security", "com.lenovo.safecenter" };

	@Override
	protected void onServiceConnected() {
		super.onServiceConnected();
		AccessibilityServiceInfo mAccessibilityServiceInfo = new AccessibilityServiceInfo();
		// ��Ӧ�¼������ͣ�������ȫ������Ӧ�¼��������������������ȣ�
		mAccessibilityServiceInfo.eventTypes = AccessibilityEvent.TYPES_ALL_MASK;
		// �������û������ͣ�������������ʾ
		mAccessibilityServiceInfo.feedbackType = AccessibilityServiceInfo.FEEDBACK_SPOKEN;
		// ���˵İ���  
        mAccessibilityServiceInfo.packageNames = packageNames;
	}

	@Override
	public void onAccessibilityEvent(AccessibilityEvent event) {

	}

	@Override
	public void onInterrupt() {

	}

	@Override
	public boolean onUnbind(Intent intent) {
		return super.onUnbind(intent);
	}
	
}
