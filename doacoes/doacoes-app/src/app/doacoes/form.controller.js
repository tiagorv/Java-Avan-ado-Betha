export default class FormController {

    constructor($stateParams, $state, DoacaoServico, DoadorServico, FamiliaServico, Notification) {
        this.record = {}
        this.title = 'Adicionando registro'
        this._service = DoacaoServico
        if ($stateParams.id) {
            this.title = 'Editando registro'
            this._service.findById($stateParams.id)
                .then(data => {
                    this.record = data
                })
        }
        this._state = $state
        this._notify = Notification

        this.doadores = []
        DoadorServico.findAll()
            .then(data => {
                this.doadores = data
            }, erro => {
                this._notify.error('Erro ao carregar os doadores!')
            })

        this.familias = []
        FamiliaServico.findAll()
            .then(data => {
                this.familias = data
            }, erro => {
                this._notify.error('Erro ao carregar as famílias!')
            })

    }

    save() {
        this._service.save(this.record)
            .then(resp => {
                this._notify.success('Registro salvo com sucesso!')
                this._state.go('doacao.list')
            }).catch(function(){
                this._notify.error('Erro ao salvar o registro!')
            })
    }
}

FormController.$inject = ['$stateParams', '$state', 'DoacaoServico', 'DoadorServico', 'FamiliaServico', 'Notification']
    