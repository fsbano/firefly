FROM python

EXPOSE 8000

ADD . /opt/firefly-django
RUN pip3 install --no-cache-dir -r /opt/firefly-django/requirements.txt

WORKDIR /opt/firefly-django

ENTRYPOINT ["python", "manage.py"]
CMD ["runserver", "0.0.0.0:8000"]
