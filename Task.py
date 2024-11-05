import requests
from bs4 import BeautifulSoup

# URL to extract the text from
url = "https://insights.blackcoffer.com/rise-of-e-health-and-its-imapct-on-humans-by-the-year-2030-2/"

# Sending a request to the URL
response = requests.get(url)

# Check if the request was successful
if response.status_code == 200:
    # Parsing the HTML content of the page
    soup = BeautifulSoup(response.content, 'html.parser')

    # Find all div elements with the specified class name
    content_divs = soup.find_all('div', class_='tdb-block-inner td-fix-index')
    
    # Check if there are enough div elements
    if len(content_divs) >= 15:
        # Select the 15th div (index 14 because lists are 0-indexed)
        content_div = content_divs[14]
        
        # Extract the text from the div
        text = content_div.get_text(separator='\n', strip=True)

        # Save the extracted text to a file
        with open('extracted_text.txt', 'w', encoding='utf-8') as file:
            file.write(text)

        print("Text has been extracted and saved to 'extracted_text.txt'")
    else:
        print(f"Could not find the 15th div. Only found {len(content_divs)} divs with the specified class.")
else:
    print(f"Failed to retrieve the webpage. Status code: {response.status_code}")
