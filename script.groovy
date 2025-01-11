def buildApp() {
    echo 'building the application STAGE...'
}

def deployApp() {
    echo "Deploying the application STAGE..."
    echo "deploying version ${params.VERSION}"
}
return this