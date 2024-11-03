import os
# Get the current working directory
saticcode='''
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>W3Schools Inspired Website</title>
    <link rel="stylesheet" href="../style.css">
</head>
<body>
    <header>
        <h1>Java Programs</h1>
        <nav>
            <ul>
                <li><a href="../2D Array/2darray.html">2D Array</a></li>
                    <li><a href="../applet/applet.html">Applet</a></li>
                    <li><a href="../basic programs/basic.html">Basic Programs</a></li>
                    <li><a href="../data conversion/data_conversion.html">Data Conversion</a></li>
                    <li><a href="../event model/event.html">Event Model</a></li>
                    <li><a href="../exceptions/excption.html">Exceptions</a></li>
                    <li><a href="../functions/function.html">Functions</a></li>
                    <li><a href="../GUI(AWT)/gui.html">GUI(AWT)</a></li>
                    <li><a href="../inheritance/inheritance.html">Inheritance</a></li>
                    <li><a href="../input-output/io.html">I/O</a></li>
                    <li><a href="../interface/interface.html">Interface</a></li>
                    <li><a href="../jdbc/jdbc.html">JDBC</a></li>
                    <li><a href="../MultiThreading/mt.html">MultiThreading</a></li>
                    <li><a href="../oops/oops.html">OOPs</a></li>
                    <li><a href="../packages/packages.html">Package</a></li>
                    <li><a href="../single array/sa.html">Single Array</a></li>
                    <li><a href="../strings/string.html">Strings</a></li>
            </ul>
        </nav>
    </header>
    <main>
        <code><pre>
'''
staticcode2=''' </main>
    <footer>
        <p>Tanu Joshi</p>
    </footer>
</body>
</html>'''

current_directory = os.getcwd()
def getthefiles(cwd):
    '''this function takes the current working directory and return the list of java program in it '''
    try :
        for item in os.listdir(cwd):
            if item.split('.')[1]=="java":
                f=open(cwd+"/"+item,'rt')
                print("opening the "+cwd+"/"+item)
                data=f.read()
                file_data=saticcode+data+"</pre></code>"+"<img src=\""+item.split('.')[0]+"output.png\" alt=\"output image\">"+staticcode2
                with open(cwd+"/"+item.split('.')[0]+".html",'w') as file:
                    print("writing the file data"+item.split('.')[0]+".html")
                    file.write(file_data)
                f.close()
                
    except Exception as e:
        print(e)
# Separate files and directories
files = []
directories = []

# Iterate over items in the current directory
for item in os.listdir(current_directory):
    if os.path.isfile(os.path.join(current_directory, item)):
        files.append(item)
    elif os.path.isdir(os.path.join(current_directory, item)):
        directories.append(item)

# Display files and directories
'''print("Files in the current directory:")
for file in files:
    if ( file.split(".")[1]=="java") :
        print(file)
'''
print("\nDirectories in the current directory:")
for directory in directories:
    if directory =="event model":
        continue
    print("current directory is "+ directory)
    getthefiles(directory)

#getthefiles('event model')
