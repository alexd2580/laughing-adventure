FROM gradle

COPY . /home/gradle

ENTRYPOINT ["gradle"]
CMD ["run"]
