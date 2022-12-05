# Java-Spring-RabbitMQ-Example

## native run (jdk 17 required)

```bash
$ docker compose up
```

Open RabbitMQ dashboard [http://localhost:15672](http://localhost:15672) with `user / password`.

## Running with containers (docker & docker-compose required)

To remove containers with all volumes:

```bash
$ docker-compose down --volumes
```

The RabbitMQProducer runs individually on `8086` port, RabbitMQConsumer runs on `8087` port