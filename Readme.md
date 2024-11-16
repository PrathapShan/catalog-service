To start minikube

  #minikube start


To build docker image

 #docker build -t catalog-service:0.0.1-SNAPSHOT .


To run and remove container

 #docker run --rm --name catalog-service -p 8080:8080 catalog-service:0.0.1-SNAPSHOT


To load the image into kubernetes

 #minikube image load catalog-service:0.0.1-SNAPSHOT


Create deployment

 #kubectl create deployment catalog-service --image=catalog-service:0.0.1-SNAPSHOT

kubectl get deployment

kubectl get pod

kubectl logs deployment/catalog-service

kubectl expose deployment catalog-service --name=catalog-service --port=8080

kubectl get service catalog-service

kubectl port-forward service/catalog-service 8000:8080


kubectl delete service catalog-service

kubectl delete deployment catalog-service

minikube stop

install grype (https://github.com/anchore/grype)

curl -sSfL https://raw.githubusercontent.com/anchore/grype/main/install.sh | sh -s -- -b /usr/local/bin

running postgres database in docker container.

docker run -d --name polar-postgres -e POSTGRES_USER=user -e POSTGRES_PASSWORD=password -e POSTGRES_DB=polardb_catalog -p 5432:5432 postgres:14.4

remove running container
>docker rm -fv polar-postgres
> 
Running tests from command line using maven
> mvnw -Dtest=BookRepositoryJdbcTests test
> mvnw -Dtest=CatalogServiceApplicationTests test
