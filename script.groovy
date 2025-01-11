def buildApp() {
    echo 'building the application DEV...'
}

def deployApp() {
    echo "Deploying the application DEV..."
    echo "deploying version ${params.VERSION}"
}
return this