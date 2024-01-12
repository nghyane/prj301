FROM mcr.microsoft.com/mssql/server:latest

# Set environment variables
ENV SA_PASSWORD=YourPassword123!
ENV ACCEPT_EULA=Y
ENV MSSQL_DATABASE=my_database

# Copy the initialization script
COPY ./init.sql /docker-entrypoint-initdb.d/
