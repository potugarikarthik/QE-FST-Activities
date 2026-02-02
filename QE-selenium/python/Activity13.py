from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.common.action_chains import ActionChains
from selenium.webdriver.common.keys import Keys
from selenium.webdriver.support.ui import WebDriverWait
from selenium.webdriver.support import expected_conditions as EC

with webdriver.Firefox() as driver:
    driver.get("https://training-support.net/webelements/tables")
    rows = driver.find_elements(By.XPATH,"//table/tbody/tr")
    cols = driver.find_elements(By.XPATH,"//table/thead/tr/th")
    print("rows: " , len(rows))
    print("cols: " , len(cols))
    i=1
    for row in rows:
        if i == 3:
            print(row.text)
        i+=1
    
    second_row_second_column = driver.find_element(By.XPATH,"//table/tbody/tr[2]/td[2]").text
    print(second_row_second_column)
    print(driver.title)
    driver.quit()
