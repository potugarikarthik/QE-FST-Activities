from selenium import webdriver
from selenium.webdriver.common.by import By

with webdriver.Firefox() as dirver:
    dirver.get("https://training-support.net/webelements/target-practice")
    print(dirver.title)
    print(dirver.find_element(By.XPATH,"//h3[@class='text-3xl font-bold text-orange-600']").text)
    print(dirver.find_element(By.XPATH,"//h5[@class='text-3xl font-bold text-purple-600']").value_of_css_property("color"))
    s=dirver.find_element(By.XPATH,"//button[contains(text(),'Purple')]").get_attribute("class")
    l=s.split(" ")
    print("purple button classes:")
    for i in l:
        print(i)
    print(dirver.find_element(By.XPATH,"//button[contains(text(),'Slate')]").text)
    dirver.quit()

