from selenium import webdriver
import time
desired_caps = {}
desired_caps['platformName'] = 'Android'  # 设备系统
desired_caps['platformVersion'] = '4.4.4'  # 设备系统版本
desired_caps['deviceName'] = 'Che1-CL10'  #  设备名称
desired_caps['appPackage'] = 'com.shuidihuzhu.aixinchou'
desired_caps['appActivity'] = '.splash.SplashActivity'
driver = webdriver.Remote("http://localhost:4723/wd/hub", desired_caps)