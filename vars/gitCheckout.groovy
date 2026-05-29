def call() {

    checkout([
        $class: 'GitSCM',
        branches: [[name: '*/pro']],
        userRemoteConfigs: [[
            url: env.GIT_URL
        ]]
    ])
}
