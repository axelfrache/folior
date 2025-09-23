# Folior

Folior is a **self-hosted documentation and knowledge management app**, built with **Kotlin + Spring Boot** (backend) and **React + Tailwind** (frontend).  
It aims to provide a clean and lightweight alternative to tools like Notion or Outline, while remaining fully **open source** and **easy to deploy**.

---

## ✨ Idea

Organize and share knowledge in a simple and structured way:

- Create **workspaces** and **nested pages** for your documentation.
- Write with a **Markdown WYSIWYG editor** (headings, lists, code blocks, images).
- Upload and manage **attachments** (stored in S3/MinIO).
- Use **full-text search** to quickly find your pages.
- Export your whole workspace as **Markdown + assets** (ZIP).

Folior is designed to be **self-hosted in a homelab** or deployed in small teams.  
No vendor lock-in: your content always stays portable.

---

## ⚙️ Tech stack

- **Backend**: Kotlin + Spring Boot 3 (Web, Security, Data JPA, Actuator)  
- **Database**: PostgreSQL (H2 for local dev) + Flyway  
- **Storage**: MinIO (S3 compatible)  
- **Frontend**: React + Tailwind  
- **Search**: PostgreSQL FTS (Meilisearch planned)  
- **DevOps**: Docker Compose (MVP), GitHub Actions (CI/CD), Prometheus/Grafana (monitoring)  

---

## 🚀 Quick start (development)

```bash
# Clone the repo
git clone https://github.com/axelfrache/folior.git
cd folior

# Start backend + database
./mvnw spring-boot:run

# Start frontend
cd frontend && npm install && npm run dev
```
