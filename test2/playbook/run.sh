#/usr/bin

USER_VAR="root"
env="DEV"
ansible-playbook -vv -i inventory --ask-pass  -c paramiko   --extra-vars="USER=$USER_VAR ENV=$env" all.yml
