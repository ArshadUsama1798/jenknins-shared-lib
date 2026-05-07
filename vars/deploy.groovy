def call(){
  sh "socker compose down && docker compose up -d --build"
}
