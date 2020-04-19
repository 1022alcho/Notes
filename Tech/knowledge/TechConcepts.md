# Sections
- [What is Servers]($what-is-servers)
- [Hub Switch Router](#hub-switch-router)
- [What is Gateway](#what-is-gateway)
- [Communicating with Probs](#communicating-with-probs)
- [Structuring Apps with Class-Based Components](#structuring-apps-with-class-based-components)
- [State in React Component](#state-in-react-component)

# What is Servers

### Servers
    - Server is a dedicated computer that provides services on behalf of clients.
    - It is a powerful centralized machine for multiple clients connect to either over the internet or a local area network to for its sepecific service. 
    - Server could be dedicated to handle one services only. 
        - There could be one server dedicated for Web server, one for Database server, one for Email server
        - Depends on what setup the organization has, all those three services can be tied up in one machine (usually small organizations)
    - A server is a ***role*** that a computer takes, not just a powerful computer.
        - Any machine can be set up as a server (file server, web server)

### Difference between Desktop vs Server machines
    - CPU
        - Desktop:
            - Intel Core i7
        - Server:
            - Intel Xeon
                - support larger amounts of RAM
                - Larger cache memory
                - HIgher core count
    - Motherboard
        - Desktop:
            - Supports only a single processor
        - Server:
            - Supporst multiple processors (CPU)
            - Design to work with multiple processors
    - Memory
        - Desktop:
            - Intel Core CPUs do not support ECC RAM
            - AMD CPUs do support ECC RAM

        - Server:
            - Xeon processors support ***ECC RAM*** (Error-Correcting Code)
            - ECC Ram is mainly used in servers.
                - Detects if the data was correctly processed by the ram module 
                - Makes a correction if it needs to prevent memory errors 
            - This is necessary for the Server machine because 
                - Server machine should be running 24/7
                - Memory error can bring down the server 
    - Hard Drive
        - Desktop
            - 
        - Server:
            - Should have hot swappable hard drives in a ***RAID*** configuration for preventing data loss
                - RAID copies data on multiple disks
                - If a hard drive were to be failed, it can be removed and replaced without shutting down the server
                - The RAID will rebuild the data on a new hard drive automatically 
    - Power Supply
        - Desktop
            - 
        - Server
            - Should have redundant power supplies for keep the server running in case of a power supply failure
     - Operating System
        - Desktop
            - 
        - Server
            - Server has its own operatin system to be used
                - LINUX
                - Microsoft Windows Server
                - Mac OS Server
            - Server OS are robust and stable
                - They are designed to be run non-stop
                - Able to handle thousands of concurrent connections

### Example of Servers with type of services
     Web Server
     - It is a server which hosts a web-site
     - Any website that you go to with the web-browser, you are connecting over the internet to that web server to pull up the website you want
     - Web server will contain all of the web-sites data including HTML code and graphics
     - Web server will also be running the web-server software

    Email Server
    - It is a server facilitate the sending and receiving of email
    - You will access the email using the web-browser or email client such as Outlook or Thunderbird using email protocols such as IMAP, POP, SMTP  

    Database Server
    - IT is a server which stores data on the backend and then it's retrieved from the computers on the front end
# Hub Switch Router

### HUB
	Features:
    - The purpose of Hub is to connect all of your network devices together on an internal network.
	- Has multiple ports which accpets ethernet connections from network devices.
	- Not intelligent, does not filter any data.
	- All it knows is when a device is connected to one of its port.
    - When a data packet arrives, data is copied to all other ports (re-broadcasting) so all the devices on that hub sees that data packet.

    Downside
    - If deviceA only wants to send a data package to deviceB, deviceC and deviceD also receive this data packet if they are tied into a single hub.
    - Re-broadcast the data to every port.
    - It can create unnecessary traffic on the network, which wastes bandwidth.

### Switch
    Features:
    - Has multiple ports which accpets ethernet connections from network devices.
    - More intelligent than the Hub.
        - It keeps a record of the physical addresses of the devices that are connected to it.
        - These address are called **Mac Address**
    - When the data packet arrives, the switch reades the MAC address and deliver the data to the intended port.
    - It can reduce number of traffic on the network.

### Router
    Features:
    - Routes or forwards data from one network to another based on their IP address.
    - Communicates between two different network using the ***same protocol***
    - Process:
        - A data packet is received from the router.
        - The router inspects the data's ip address.
        - Determines if the data packet meant for its own network or out of network.
            - If the data packet is meant for its own network, it receives it.
            - If the data packet is meant for out of network, it sends it off to another network.
    - The router is essentially the gateway of a network.

### Summary
    Hub & Switches common features:
    - Used to exchange data within a local area network.
    - Not used to exchange data outside their own network.
    - To exchange data outside their own network, a device needs to be able to read I.P. addresses. (Router)
    - Used to create networks.

    Router:
    - Used to connect networks.

# What is Gateway

### Gateway
    - A gateway is a network node that connects two networks using ***different protocals*** together.
    - It also acts as a "gate" between two networks. It may be a router, firewall, server, or other device that enables traffic to flow in and out of the network.
    

    