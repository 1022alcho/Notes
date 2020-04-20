https://www.youtube.com/channel/UCJQJ4GjTiq5lmn8czf8oo0Q/videos

# Sections
- [What is Servers]($what-is-servers)
- [Hub Switch Router](#hub-switch-router)
- [What is Gateway](#what-is-gateway)
- [What is Proxy Server](#what-is-proxy-server)
- [Network Topologies](#network-topologies)
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
    CPU
        - Desktop:
            - Intel Core i7
        - Server:
            - Intel Xeon
                - support larger amounts of RAM
                - Larger cache memory
                - HIgher core count
    Motherboard
        - Desktop:
            - Supports only a single processor
        - Server:
            - Supporst multiple processors (CPU)
            - Design to work with multiple processors
    Memory
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
    Hard Drive
        - Desktop
            - 
        - Server:
            - Should have hot swappable hard drives in a ***RAID*** configuration for preventing data loss
                - RAID copies data on multiple disks
                - If a hard drive were to be failed, it can be removed and replaced without shutting down the server
                - The RAID will rebuild the data on a new hard drive automatically 
    Power Supply
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

    Disadvantage
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
    

# What is Proxy Server
    - A Proxy Server is a server which retrieves the data out on the internet such as a web page on behalf of user. 
    - When you are requesting for a website, the proxy server receives the request from your computer, then the proxy server will directly retrieve that webpage on your behalf and send to your computer.
    Features:
    - It allows you to surf the internet anonymously (hides your IP address).
        - Without using a proxy, your public IP address is visible.
            - Other people can know which web site you are viweing.
        - As the proxy server is retrieving the web page for you, only the IP address of the proxy server can be seen viewing the web page.
        - Your Computer -[Your IP Address]-> Proxy Server -[Proxy Server IP Address & Visible]-> Internet
    - Speed
        - When a user requests a web page, the proxy will cache the web page after delieverying it to the user.
        - When a different user requests a same web page, the proxy will retrieve the web page from the proxy database (cache) and send it to the user without going out to the internet
    - Saves bandwidth
        - Since it has the cache mechanism, it reduces the needs to go out to the internet to retrieve data because it already has that data in the database
    - Activity logging
        - Organizations uses proxy to keep track of what websites their employees visit.
        - The proxy will create a record of what web site users have visited, and how long they were on that website.
        - In addition, Organizations can also configure the proxy to block certain web sites to keep their employees from visiting them.
    Disadvantage:
    - It cannot encrypt data
        - The data can be intercepted by hackers, government, ISP (Internet Service Provider)
    - This is where ***VPN*** Virtual Private Network comes in
        - Hides your IP address
        - Encrypts the data that's being transferred over the internet
        - Provides a dedicated secure tunnel between 2 points over the internet


# What is Network Topology
    - A topology is the layout of how a network communicates with different devices.
    - There are a couple of different categories of topologies
         - Wired
            - Star Topology
                - Features:
                    - All computers are connected to a central wiring point, such as a hub or switch.
                - Advantages:
                    - If one of the computer fail or there is a break in the cable, other computers won't be affected because each cables have its own connections.
                - Disadvantages:
                    - Single point failure
                        - If the central hub or switch fails, all of the computer on that central point would be affected. 
                        - Entire network goes down
            - Ring Topology
                - Features:
                    - Type of a network configuration which each computer is connected to each other. 
                    - Shape of closed loop or ring.
                    - Each data packet is sent around the ring and reaches its final destination
                - Advantages:
                    - It is very old mechanism and rarely used
                    - It can be easily installed
                    - It can be easily troubleshoot
                - Disadvantages:
                    - It is a very old mechanism and rarely used these days.
                    - If one of cables breaks or one of the computers goes down, all of the data flow would be disrupted
            - Bus Topology
                - Features:
                    - Similar to Ring Topology which all the computers are connected to a sing cable or back bone (coaxial cable)
                    - Computers are connected to this back bone (coaxial cable) by using BNC connector
                - Advantages:
                    - It is very cheap and can easy to implement.
                - Disadvantages:
                    - It requires a (coaxial) cable be terminated at both ends using terminators.
                    - In order for this set up to remain operational, there must not be any open connections including the ends that are attached to the computers.
                    - Risk of ***Signal Reflection***
                        - If a computer is removed or the terminator is loosened or missing then the cable would be opened and the data would be bounced back.
                        - When this happens, the data flow would be disrupted.
            - Mesh Topology
                - Features:
                    - Each Computer is connected to every other computers on the network.
                - Advantages:
                    - By having so many connections, it handles failures very well.
                    - It creates a high redundancy level.
                    - Even a single connection to be failed, computers would still be able to communicate to each other.
                - Disadvantages: 
                    - Because of the amount of cabling and network cards that have to be used, Mesh Topology can be expensive.
                    - They are rarely used in local network but mainly used in wide area network like the internet.
                - Internet:
                    - The internet is connected using routers all over the world that are connected each other to route data to their intended destination.
                    - Even if a few routers go down, the data will get re-routed using a different path to ultimately reach their destination. 
                    - A internet is very redundant
         - Wireless
            - Infrastructure Topology
                - Features:
                    - This is a combination of wired and wireless topology.
                    - Similar to Star Topology, computers are physically connected to a switch.
                    - Has wireless access point that's also connected by a cable to the same switch.
                        - This wireless access point allows wireless devices to be connected to the network such as laptop or cell phone.
            - Ad hoc Topology
                - Features:
                    - Very simple wireless topology.
                    - Doesn't rely on any infrastructure, such as cables, routers, servers, WAPs (Wirless Access Points)
                    - All the devices on a Ad hoc network wirelessly connect to other devices in a simple peer to peer network.
                    - Each devices are responsible for its own security and permissions.
                    - Ad hoc is used for setting up as quick wirless network on the fly where devices share data without the need of existing wireless network.
            - Wireless Mesh Topology
                - Features:
                    - Similar to Wired Mesh Topology where devices are inter-connected to each other but with the exception that they are wirelessly inter-connected.
                    - Each wireless access points will talked to other access points to create seemless internet connection for wireless devices to connect to
                - Advantages:
                    - Even one of the wireless access point would fail, other access points would re-route the data.
                    - It is very redundant because internet connection is widely spread out using many wireless access points