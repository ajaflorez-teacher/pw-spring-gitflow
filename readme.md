# Programación Web

Este es un ejemplo de Git y GitFlow

Configurar el nombre:
`git config --global user.name "Juan Flores-Moroco"`

Configurar el email:
`git config --global user.email "ajaflorez.upc@gmail.com`

Para ver la lista de la configuración:
`git config --global --list`

Comando para realizar un commit
`git commit -m "first commit"`

comando para ver el historial de commits
`git log`
`git log --stat`
`git log --pretty=oneline`
`git log --pretty=format:"%h %s" --graph`

Vincular el repositorio local con el remoto
`git remote add origin https://github.com/ajaflorez-teacher/pw-spring-gitflow.git`

Verificar con que repositorio remoto esta enlace el repositorio local
`git remote -v`