def buildApp() {
    echo 'building the application...'
}

def deployApp() {
    echo "Deploying the application..."
    echo "deploying version ${params.VERSION}"
}
return this