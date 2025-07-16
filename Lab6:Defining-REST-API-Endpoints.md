## Lab 6: Define Your REST API Endpoints
### Goal: 
In this lab, you will design and document the REST API endpoints for the Zoo Simulator. Defining your API up front ensures clarity, consistency, and maintainability across your project.

By completing this lab, you’ll have a clear and well-structured API specification that can guide your controller and service implementation.

***
## API Resources

| Resource       | Description |
|----------------|-------------|
| `visitors`     | Represents zoo visitors who can buy tickets, visit shops, enclosures, and hospitals. |
| `tickets`      | Represents admission tickets that can be generated, validated, retrieved, or deleted. |
| `zoo`          | Represents the zoo entity, used for entering, exiting, opening, and closing the zoo. |
| `shops`        | Represents shops inside the zoo that can be visited by visitors and assigned to vendors. |
| `products`     | Represents products sold in shops (e.g., plushies) that can be filtered, purchased, or deleted. |
| `enclosures`   | Represents animal enclosures that can be visited and interacted with (e.g., feed/exercise animals). |
| `animals`      | Represents zoo animals, which can be moved, healed, exercised, examined, or deleted. |
| `hospitals`    | Represents animal hospitals in the zoo where animals can be healed or examined. |
| `lectures`     | Represents science lectures hosted in hospitals by veterinarians or attended by visitors. |
| `vendors`      | Represents shop vendors who sell products and can be assigned to shops by managers. |
| `handlers`     | Represents zoo handlers responsible for feeding, exercising, or examining animals. |
| `veterinarians`| Represents vets responsible for healing animals, giving lectures, or viewing hospital tasks. |
| `managers`     | Represents zoo managers who manage staff assignments and zoo state (open/close). |
| `tasks`        | Represents available tasks for handlers or veterinarians. |


## API Endpoints:
### Visitors
| HTTP Verb | Resource URL | Use Case Representation |
|-----------|--------------|--------------------------|
| POST | `/visitors/1/tickets` | Visitor 1 buys a ticket |
| GET  | `/visitors/1/tickets` | Get all tickets of visitor 1 |
| POST | `/zoo/1/visits` | Visitor enters zoo 1 |
| POST | `/shops/2/visits` | Visitor visits shop 2 |
| GET  | `/shops/2/products?category=plushies` | Filter products in shop 2 to plushies |
| POST | `/shops/2/products/4/` | Buy product 4 (plushie) |
| POST | `/enclosures/1/visit` | Visitor goes to enclosure 1 (feline) |
| GET  | `/enclosures/1/options` | Show available options/tasks in enclosure 1 |
| POST | `/enclosures/1/animals/2/` | Feed animal 2 in enclosure 1 |
| POST | `/hospitals/1/lectures/1/` | Attend science lecture 1 in hospital 1 |
| POST | `/zoo/1/` | Exit zoo 1 |
| DELETE | `/visitors/1/tickets` | Delete all tickets of visitor 1 |

---

### Tickets
| HTTP Verb | Resource URL | Use Case Representation |
|-----------|--------------|--------------------------|
| POST | `/tickets` | Generate a new ticket |
| GET  | `/tickets/2` | Get ticket with ID 2 |
| POST | `/tickets/2/validate` | Validate ticket 2 |

---

### Enclosures
| HTTP Verb | Resource URL | Use Case Representation |
|-----------|--------------|--------------------------|
| GET  | `/enclosures/1/animals` | Get all animals in enclosure 1 |
| GET  | `/enclosures` | Get all enclosures |

---

### Animals
| HTTP Verb | Resource URL | Use Case Representation |
|-----------|--------------|--------------------------|
| PATCH | `/animals/1/hospital/1` | Transfer animal 1 to hospital 1 |
| DELETE | `/animals/1` | Delete animal who passed away |

---

### Vendors
| HTTP Verb | Resource URL | Use Case Representation |
|-----------|--------------|--------------------------|
| POST | `/vendors/1/product/1/visitor/2` | Vendor sells item 1 to visitor 2 |
| GET  | `/products` | Display all available products |
| DELETE | `/products/3` | Delete product 3 |
| PATCH | `/zoo/1/exit` | Exit zoo 1 (vendor) |

---

### Handlers
| HTTP Verb | Resource URL | Use Case Representation |
|-----------|--------------|--------------------------|
| POST | `/enclosures/2/animals/tiger/feed` | Feed tiger in enclosure 2 |
| POST | `/enclosures/1/animals/rhino/exercise` | Exercise rhino in enclosure 1 |
| POST | `/enclosures/3/animals/owl/examine` | Examine owl in enclosure 3 |
| GET  | `/handlers/tasks` | Get available handler tasks |
| PATCH | `/zoo/1/exit` | Exit zoo 1 (handler) |

---

### Veterinarians
| HTTP Verb | Resource URL | Use Case Representation |
|-----------|--------------|--------------------------|
| GET  | `/veterinarians/tasks` | Get available vet tasks |
| GET  | `/veterinarians/1/hospital/1/animals` | Get all animals to heal for vet 1 |
| POST | `/hospitals/1/animals/2/` | Heal animal 2 in hospital 1 |
| POST | `/veterinarians/4/lectures/3` | Vet 4 gives lecture 3 |
| PATCH | `/animals/2/enclosure/2` | Return animal 2 to enclosure 2 |
| PATCH | `/zoo/1/exit` | Exit zoo 1 (vet) |

---

### Managers
| HTTP Verb | Resource URL | Use Case Representation |
|-----------|--------------|--------------------------|
| PATCH | `/zoo/1/` | Manager opens zoo 1 |
| PATCH | `/zoo/1/` | Manager closes zoo 1 |
| POST | `/vendor/1/shop/3` | Assign vendor 1 to shop 3 |
| POST | `/vendor/2/shop/1` | Assign vendor 2 to shop 1 |
| POST | `/handler/1/enclosure/3` | Assign handler 1 to enclosure 3 |
| POST | `/vet/2/hospital/1` | Assign vet 2 to hospital 1 |

---

### Hospitals
| HTTP Verb | Resource URL | Use Case Representation |
|-----------|--------------|--------------------------|
| GET  | `/hospitals/1/animals` | Get all animals in hospital 1 |
