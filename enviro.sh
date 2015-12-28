env | grep APP_NAME
if [ -z "$TRAVIS_TAG" ]; then
    APP_NAME=hackathon1-development
else
    APP_NAME=hackathon1
fi

sed -i "s/hostName/$APP_NAME/g" manifest.yml
sed -i "s/appName/$APP_NAME/g" manifest.yml
env | grep APP_NAME